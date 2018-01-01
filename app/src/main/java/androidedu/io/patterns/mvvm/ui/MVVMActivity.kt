package androidedu.io.patterns.mvvm.ui

import android.os.Bundle
import androidedu.io.patterns.BR
import androidedu.io.patterns.R
import androidedu.io.patterns.mvvm.model.User
import androidedu.io.patterns.mvvm.viewmodel.UserViewModel
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

// Respect -> https://medium.com/@zhangqichuan/android-development-with-mvvm-and-kotlin-9598c3623ce1

class MVVMActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm)

        val user = User()
        user.age = 20
        user.female = false
        user.firstName = "Johnny"
        user.lastName = "Depp"
        user.imageUrl = "https://media.giphy.com/media/zv8PVZLXBj81a/giphy.gif"
        user.tagline = "When Johnny Depp is young"

        val userViewModel = UserViewModel(user)

        val binding = DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_mvvm)
        binding.setVariable(BR.user, userViewModel)
    }
}
