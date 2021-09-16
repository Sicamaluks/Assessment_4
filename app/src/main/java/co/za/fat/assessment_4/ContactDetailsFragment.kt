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
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.squareup.picasso.Picasso


class ContactDetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = view?.findViewById<TextView>(R.id.name)
        val profilePic = view?.findViewById<ImageView>(R.id.profilePic)

        name?.text = arguments?.getString("name")
        Picasso.get().load(arguments?.getString("profileUrl")?.toUri()).into(profilePic)

        val btnShare = view?.findViewById<Button>(R.id.btn_share)
        val shareEmail = view?.findViewById<TextView>(R.id.name).toString()

        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, shareEmail)
            type = "text/plain"
        }

        val shareIntent = Intent.createChooser(sendIntent, null)
        btnShare?.setOnClickListener {
            startActivity(shareIntent)
        }
    }


}