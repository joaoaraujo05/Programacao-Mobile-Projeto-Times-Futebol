package com.unaerp.projeto_futebol

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.unaerp.projeto_futebol.databinding.FragmentDetalhesBinding
import com.unaerp.projeto_futebol.model.buscarTimePorId

class DetalhesFragment : Fragment() {

    companion object {
        private const val ARG_TIME_ID = "arg_time_id"

        fun newInstance(timeId: Int): DetalhesFragment {
            val fragment = DetalhesFragment()
            val args = Bundle()
            args.putInt(ARG_TIME_ID, timeId)
            fragment.arguments = args
            return fragment
        }
    }

    private var binding: FragmentDetalhesBinding? = null

    private var favorito = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val novoBinding = FragmentDetalhesBinding.inflate(inflater, container, false)
        binding = novoBinding
        return novoBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val b = binding ?: return

        val id = arguments?.getInt(ARG_TIME_ID, -1) ?: -1
        val time = buscarTimePorId(id)

        if (time == null) {
            requireActivity().finish()
            return
        }

        b.tvNome.text = time.nome
        b.tvCidade.text = time.cidade
        b.tvFundacao.text = time.anoFundacao.toString()
        b.tvEstadio.text = time.estadio
        b.ivEscudo.setImageResource(time.escudo ?: R.drawable.ic_escudo_padrao)

        favorito = savedInstanceState?.getBoolean("favorito") ?: false
        atualizarEstrela()

        b.ivFavorito.setOnClickListener {
            favorito = !favorito
            atualizarEstrela()

            val mensagem = if (favorito) {
                "${time.nome} adicionado aos favoritos"
            } else {
                "${time.nome} removido dos favoritos"
            }
            Toast.makeText(requireContext(), mensagem, Toast.LENGTH_SHORT).show()
        }

        b.toolbar.setNavigationOnClickListener {
            requireActivity().finish()
        }
    }

    private fun atualizarEstrela() {
        val icone = if (favorito) {
            android.R.drawable.btn_star_big_on
        } else {
            android.R.drawable.btn_star_big_off
        }
        binding?.ivFavorito?.setImageResource(icone)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean("favorito", favorito)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}