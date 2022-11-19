package com.example.kaukaukau

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kaukaukau.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    var binding: FragmentLoginBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnLogin?.setOnClickListener {
            if(true) findNavController().navigate(R.id.action_loginFragment_to_timetableFragment)
            //TODO 조건에 "로그인 정보 맞으면"
        }
        binding?.btnJoin?.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_joinFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}