package co.za.fat.assessment_4.data

import androidx.core.net.toUri
import co.za.fat.assessment_4.model.Contact

class DataSource {
    fun loadContacts(): List<Contact>{
        return listOf<Contact>(
            Contact("Simon", "Maluleka", "Crazee Apps", "078XXXXXXX","SimonMaluleka@crazeeapps.com", "https://www.google.com/search?q=sicamaluks&sxsrf=AOaemvKxwLYa6_XVtCVaRKuJDejxNCJCbg:1631729776660&tbm=isch&source=iu&ictx=1&fir=rvYiLoOrSExGPM%252CMYyPnRlUBLKi9M%252C_&vet=1&usg=AI4_-kRC_5A3x_aMQCPYJ95bpAGTJ8md3w&sa=X&ved=2ahUKEwjM69ONy4HzAhXAQEEAHbWhC64Q9QF6BAgkEAE#imgrc=rvYiLoOrSExGPM"),
            Contact("Akani", "Sekanka", "Crazee Apps", "071XXXXXXX","AkaniSekanka@crazeeapps.com", "https://www.google.com/search?q=sicamaluks&sxsrf=AOaemvKxwLYa6_XVtCVaRKuJDejxNCJCbg:1631729776660&tbm=isch&source=iu&ictx=1&fir=rvYiLoOrSExGPM%252CMYyPnRlUBLKi9M%252C_&vet=1&usg=AI4_-kRC_5A3x_aMQCPYJ95bpAGTJ8md3w&sa=X&ved=2ahUKEwjM69ONy4HzAhXAQEEAHbWhC64Q9QF6BAgkEAE#imgrc=rvYiLoOrSExGPM"),
            Contact("Botshelo", "Sekanka", "Crazee Apps", "071XXXXXXX","AkaniSekanka@crazeeapps.com", "https://www.google.com/search?q=sicamaluks&sxsrf=AOaemvKxwLYa6_XVtCVaRKuJDejxNCJCbg:1631729776660&tbm=isch&source=iu&ictx=1&fir=rvYiLoOrSExGPM%252CMYyPnRlUBLKi9M%252C_&vet=1&usg=AI4_-kRC_5A3x_aMQCPYJ95bpAGTJ8md3w&sa=X&ved=2ahUKEwjM69ONy4HzAhXAQEEAHbWhC64Q9QF6BAgkEAE#imgrc=rvYiLoOrSExGPM")
        )
    }
}