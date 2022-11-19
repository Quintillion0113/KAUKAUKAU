package com.example.kaukaukau

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kaukaukau.databinding.FragmentJoinBinding
import com.example.kaukaukau.databinding.FragmentMenuBinding


class JoinFragment : Fragment() {

    var binding: FragmentJoinBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentJoinBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnChknumber?.setOnClickListener {
            if(true) findNavController().navigate(R.id.action_joinFragment_to_loginFragment)
            //TODO 조건에 "인증번호 맞으면"
            //TODO 개인정보 서버에 저장하기
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}