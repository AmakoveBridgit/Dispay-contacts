
package com.example.displaycontact_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.displaycontact_assignment.databinding.ActivityMainBinding
import java.util.jar.Attributes


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding // instantiate the binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContact()
        binding.btButton.setOnClickListener {
            val intent = Intent(this, AddContactActivity::class.java)
            startActivity(intent)
        }
    }

    fun displayContact() {
        var contact1 = Contacts(
            "Bridgit",
            "0712345345",
            "bridgit@gmail.com",
            "https://media.istockphoto.com/id/477151294/photo/smile-girl-at-beach.webp?b=1&s=170667a&w=0&k=20&c=ED-0JCVCFv_AjX7TZ-YJTh5sUA4D7jBrTsUmiEmtO4Y="
        )
        var contact2 = Contacts(
            "Mary",
            "0789554352",
            "mary@gmail.com",
            "https://media.istockphoto.com/id/864516870/photo/young-woman-photographing-the-autumn-season.webp?b=1&s=170667a&w=0&k=20&c=vNF_OOYGXK4_PyMAhZc0FS4JpfVpFfj6ROYAETxdM6g="
        )
        var contact3 = Contacts(
            "Aniso",
            "0782364352",
            "aniso@gmail.com",
            "https://media.istockphoto.com/id/477151294/photo/smile-girl-at-beach.webp?b=1&s=170667a&w=0&k=20&c=ED-0JCVCFv_AjX7TZ-YJTh5sUA4D7jBrTsUmiEmtO4Y="
        )
        var contact4 = Contacts(
            "Joy",
            "0756364352",
            "joy@gmail.com",
            "https://media.istockphoto.com/id/1388253782/photo/positive-successful-millennial-business-professional-man-head-shot-portrait.webp?b=1&s=170667a&w=0&k=20&c=KZM6TIhdaJAy28BA9sg0Sn-ZRd160F6HytdAKykza-s="
        )

        val contactList = listOf(contact1, contact2, contact3, contact4)
        val contactAdapter = ContactAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter
    }
}