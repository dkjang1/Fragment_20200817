package com.kakao.fragment_20200817.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kakao.fragment_20200817.R
import kotlinx.android.synthetic.main.fragment_second.*
import android.widget.Toast as Toast

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        toastBtn.setOnClickListener{
//            Toast.makeText(activity,"토스트 출력",Toast.LENGTH_SHORT).show()
            Toast.makeText(context,"토스트 출력",Toast.LENGTH_SHORT).show()
        }


    }
}