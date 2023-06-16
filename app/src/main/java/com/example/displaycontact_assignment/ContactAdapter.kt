package com.example.displaycontact_assignment


import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.displaycontact_assignment.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

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
        binding.tvNames.text=currentContact.displayName
        binding.tvPhoneNumber.text= currentContact.phoneNumber

        binding.tvEmaily.text=currentContact.email






        Picasso
            .get()
            .load(currentContact.avatar)
            .placeholder(R.drawable.pic)
            .error(R.drawable.pic)
//            .resize(80,80)
//            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.imageView)




    }
}
class ContactViewHolder( var binding:ContactListItemBinding):ViewHolder(binding.root)
//class ContactViewHolde (var binding: ContactListItemBinding):ViewHolder(binding.root)





