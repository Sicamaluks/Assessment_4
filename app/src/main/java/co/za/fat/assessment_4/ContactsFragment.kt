package co.za.fat.assessment_4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ContactsFragment : Fragment(R.layout.fragment_contacts) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contacts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val addAccount = view.findViewById<Button>(R.id.add_account)
        val importContacts = view.findViewById<Button>(R.id.import_contacts)
        val addContact = view.findViewById<FloatingActionButton>(R.id.add_contact)
        addAccount?.setOnClickListener {
            Toast.makeText(view.context,"Add Account", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_contactsFragment_to_addContactFragment)
        }
        importContacts?.setOnClickListener {
            Toast.makeText(view.context, "Import Contacts", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_contactsFragment_to_addContactFragment)
        }
        addContact?.setOnClickListener{
            //Fragment.replace(R.id.nav_host_fragment, R.id.addContactFragment).commit()
            Toast.makeText(view?.context, "Add Contact", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_contactsFragment_to_addContactFragment)



        }
    }

}