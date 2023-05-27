package com.example.displaycontact_assignment


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.displaycontact_assignment.databinding.ContactListItemBinding

class ContactAdapter(var ContactList:List<Contacts>) : RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            ContactListItemBinding .inflate(LayoutInflater.from(parent.context),parent ,false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return ContactList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact =ContactList.get(position)
        var  binding=holder.binding
        binding.tvName.text=currentContact.displayName
        binding.tvPhoneNumber.text=currentContact.phoneNumber.toString()
        binding.tvEmail.text =currentContact.email

    }
}
class ContactViewHolder( var binding:ContactListItemBinding):ViewHolder(binding.root)





