package co.za.fat.assessment_4

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import co.za.fat.assessment_4.adapters.ListAdapter
import co.za.fat.assessment_4.data.DataSource

class ContactListFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contact_list, container, false)
        val myDataset = DataSource().loadContacts()
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerview)
        val adapter = ListAdapter(this, myDataset)
        recyclerView?.adapter = adapter
        recyclerView?.setHasFixedSize(true)


        adapter.onClick = { contact ->
            val bundle = bundleOf("name" to contact.firstName, "profileUrl" to contact.profilePic)

            findNavController().navigate(R.id.action_contactListFragment_to_contactDetailsFragment, bundle)

        }
        // Inflate the layout for this fragment
        return view

    }


}