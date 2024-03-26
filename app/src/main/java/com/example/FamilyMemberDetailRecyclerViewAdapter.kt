package com.example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rms_project_v2.R
import com.google.android.play.integrity.internal.c
import com.google.firebase.database.core.Context
import com.example.FamilyMemberDetailRecyclerViewAdapter.MemberViewHolder

class FamilyMemberDetailRecyclerViewAdapter(val memberList:List<Member>):
    RecyclerView.Adapter<FamilyMemberDetailRecyclerViewAdapter.MemberViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.customers_profile_cardview, parent, false)
        return FamilyMemberDetailRecyclerViewAdapter.MemberViewHolder(view)
    }

    override fun getItemCount(): Int {
        return memberList.size
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        val currentUser = memberList[position]
        holder.user_name.text = currentUser.name
        holder.number.text = currentUser.phone_no
        holder.telecom.text = currentUser.telecom
    }
    class MemberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val user_name = itemView.findViewById<TextView>(R.id.name)
        val number = itemView.findViewById<TextView>(R.id.Phone_number_temp)
        val telecom = itemView.findViewById<TextView>(R.id.telecom_temp)
    }

}