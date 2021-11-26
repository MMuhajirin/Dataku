package com.example.dataku

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*
import java.util.ArrayList

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Muhamad Muhajirin", "Laki-Laki", "muhamadmuhajirin@gmail.com", "085748765432", "Kediri")
        )
        listTeman.add(
            MyFriend("Indah Kurniani", "Perempuan", "indahkurniani@gmail.com", "082321456987", "Singosari")
        )
        listTeman.add(
            MyFriend("Ira Kestina Damayanti", "Perempuan", "irakestinadamayanti@gmail.com", " 085432178654", "Kediri")
        )
        listTeman.add(
            MyFriend("Veti Ningrum", "Perempuan", "vetiningrum@gmail.com", "085679875432", "Malang")
        )
        listTeman.add(
            MyFriend("Mochamamad Khafidz", "Laki-Laki", "mochammadkhafidz@gmail.com", "082213654768", "Batu")
        )
        listTeman.add(
            MyFriend("Kharisma Dharma Putra", "Laki-Laki", "kharismadharmaputra@gmail.com", "085643219876", "Malang")
        )
        listTeman.add(
            MyFriend("Arhamiz Mika", "Perempuan", "arhamizmika@gmail.com", "087654321987", "Singosari")
        )
    }

    private fun tampilTeman(){
        rv_ListMyFriends.layoutManager=LinearLayoutManager(activity)
        rv_ListMyFriends.adapter=MyFriendAdapter(requireActivity(), listTeman)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}