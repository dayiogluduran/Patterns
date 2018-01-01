package androidedu.io.patterns.mvvm

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │
//│ ─────────────────────────── │
//│ 17.11.2018 - 08:09          │
//└─────────────────────────────┘

@BindingAdapter("bind:imageUrl")
fun loadImage(view: ImageView, url: String) {
    Glide.with(view).load(url).into(view)
}