package com.example.realchat.utils

import com.google.firebase.database.FirebaseDatabase

class DBReference {
    companion object{
       val  chatRef = FirebaseDatabase.getInstance().reference.child("Contacts")
       val  userRef = FirebaseDatabase.getInstance().reference.child("Users")
       val  userStateRef = FirebaseDatabase.getInstance().reference.child("UserState")
       val  groupRef = FirebaseDatabase.getInstance().reference.child("Groups")
       val  myGroupRef = FirebaseDatabase.getInstance().reference.child("MyGroupRef")
    }
}