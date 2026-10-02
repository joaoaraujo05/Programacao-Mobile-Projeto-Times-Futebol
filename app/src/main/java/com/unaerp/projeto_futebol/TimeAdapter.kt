package com.unaerp.projeto_futebol

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.unaerp.projeto_futebol.databinding.ItemTimeBinding
import com.unaerp.projeto_futebol.model.Time

class TimeAdapter (
    private val times: List<Time>,
    private val onTimeClick: (Time) -> Unit
) : RecyclerView.Adapter<TimeAdapter.TimeViewHolder>() {

    class TimeViewHolder(val binding: ItemTimeBinding) :
            RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemTimeBinding.inflate(inflater, parent, false)
        return TimeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TimeViewHolder, position: Int) {
        val time = times[position]
        holder.binding.tvNome.text = time.nome
        holder.binding.tvCidade.text = time.cidade

        holder.binding.root.setOnClickListener {
            onTimeClick(time)
        }
    }

    override fun getItemCount(): Int {
        return times.size
    }
}