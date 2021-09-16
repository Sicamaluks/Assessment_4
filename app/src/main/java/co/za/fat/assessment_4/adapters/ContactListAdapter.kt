package co.za.fat.assessment_4.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import co.za.fat.assessment_4.ContactListFragment
import co.za.fat.assessment_4.R
import co.za.fat.assessment_4.model.Contact


class ListAdapter(
    private val context: ContactListFragment,
    private val dataset: List<Contact>
) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    var onClick: ((Contact) -> Unit)? = null

    inner class ListViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val tvFirstname: TextView = view.findViewById(R.id.tv_firstname)
        val tvLastname: TextView = view.findViewById(R.id.tv_lastname)
        val tvCompany: TextView = view.findViewById(R.id.tv_company)
        val tvMobile: TextView = view.findViewById(R.id.tv_mobile)
        val tvEmail: TextView = view.findViewById(R.id.tv_email)

        init {
            itemView.setOnClickListener {
                onClick?.invoke(dataset[adapterPosition])


            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ListViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val item = dataset[position]
        holder.tvFirstname.text = item.firstName
        holder.tvLastname.text = item.lastName
        holder.tvCompany.text = item.company
        holder.tvMobile.text = item.mobile
        holder.tvEmail.text = item.email

        println(holder.tvLastname.text)
    }

    override fun getItemCount() = dataset.size

}