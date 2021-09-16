package co.za.fat.assessment_4

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.Toast.LENGTH_LONG
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController

class AddContactFragment : Fragment(R.layout.fragment_addcontact) {
    private var REQUESTCODE = 100


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_addcontact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etFirstname = view.findViewById<EditText>(R.id.et_firstname).toString()
        val etLastname = view.findViewById<EditText>(R.id.et_lastname).toString()
        val etCompany = view.findViewById<EditText>(R.id.et_company).toString()
        val tvAddPhone = view.findViewById<TextView>(R.id.tv_add_phone)
        val tvAddMail = view.findViewById<TextView>(R.id.tv_add_mail)
        val addPicture =  view?.findViewById<Button>(R.id.add_photo)

        val ivAddPhone = view.findViewById<ImageView>(R.id.add_phone)
        val ivAddEmail = view.findViewById<ImageView>(R.id.add_email)

        addPicture.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, REQUESTCODE)

        }

        ivAddEmail.setOnClickListener {
            tvAddMail.text =""
            val llAddMail =
                view.findViewById<androidx.appcompat.widget.LinearLayoutCompat>(R.id.ll_add_mail)
            val etAddMail = EditText(view.context)
            etAddMail.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )

            etAddMail.hint = "Add phone email"
            etAddMail.id = (R.id.et_add_email)



            if (view.findViewById<EditText>(R.id.et_add_email) == null) {
                llAddMail.addView(etAddMail)
            }
        }
        ivAddPhone.setOnClickListener {
            tvAddPhone.text = ""
            val llAddPhone =
                view.findViewById<androidx.appcompat.widget.LinearLayoutCompat>(R.id.ll_add_phone)


            val etAddPhone = EditText(view.context)
            etAddPhone.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )

            etAddPhone.hint = "Add phone number"
            etAddPhone.id = (R.id.et_add_phone)

            if (view.findViewById<EditText>(R.id.et_add_phone) == null) {

                llAddPhone.addView(etAddPhone)
            }

        }

        val btnSave = view?.findViewById<Button>(R.id.btn_save)

        btnSave.setOnClickListener {
            findNavController().navigate(R.id.action_addContactFragment_to_contactListFragment)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val imageView = view?.findViewById<ImageView>(R.id.iv_addProfile)
        if(resultCode == Activity.RESULT_OK &&
            requestCode == REQUESTCODE &&
            data != null){
            imageView?.setImageBitmap(data.extras?.get("data") as Bitmap)
        }
    }

}