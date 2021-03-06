package esprims.gi2.esprims

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import com.bumptech.glide.Glide
import esprims.gi2.esprims.databinding.FragmentEmlpoiExamenBinding


class EmlpoiExamenFragment : Fragment() {
    private  lateinit var  binding:FragmentEmlpoiExamenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding= FragmentEmlpoiExamenBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.myProgressBar.isVisible=false
        Glide.with(requireActivity()).load((activity as MainActivity).emlpoiEx).into(binding.emploiEx)

        binding.plus.setOnClickListener {
            binding.zoomLayout.zoomIn()
        }

        binding.minus.setOnClickListener {
            binding.zoomLayout.zoomOut()
        }

    }




}