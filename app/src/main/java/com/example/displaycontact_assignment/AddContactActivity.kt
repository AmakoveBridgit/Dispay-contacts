package com.example.displaycontact_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.displaycontact_assignment.databinding.ActivityAddContactBinding

class AddContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnButtn.setOnClickListener {
            validateContact()
            clearErrors()
        }
    }


    fun validateContact() {
        val name = binding.etName.text.toString()
        val phoneNumber = binding.etPhone.text.toString()
        val email = binding.etEmail.text.toString()
        var error=false
        if (name.isBlank()) {
            binding.tilName.error = " Name required"
            error = true
        }
        if (phoneNumber.isBlank()) {
            binding.tilPhone.error = "Phone Number is required"
            error = true
        }
        if (email.isBlank()) {
            binding.tilEmail.error = "Email  is required"
            error = true

        }

        if (!error) {
            Toast.makeText(
                this, "$name $phoneNumber $email",
                Toast.LENGTH_LONG
            ).show()

        }
        }

        fun clearErrors(){
            binding.tilName.error=null
            binding.tilPhone.error=null
            binding.tilEmail.error=null
        }
    }





