
package com.example.displaycontact_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.displaycontact_assignment.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContact()
    }
    fun displayContact(){
        var contact1=Contacts("Bridgit","0712345345",
            "bridgit@gmail.com")
        val contact2=Contacts("Mary","0789554352","mary@gmail.com")
        val contact3=Contacts("Aniso","0782364352","aniso@gmail.com")
        val contact4=Contacts("Joy","0756364352","joy@gmail.com")
        val contact5=Contacts("Pauline","0782365352","pauline@gmail.com")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5)
        val contactAdapter=ContactAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactAdapter
    }
}