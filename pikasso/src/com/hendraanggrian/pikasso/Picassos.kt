@file:Suppress("NOTHING_TO_INLINE")

package com.hendraanggrian.pikasso

import android.content.Context
import com.squareup.picasso.Picasso

/** The global [Picasso] instance. */
inline val picasso: Picasso get() = Picasso.get()

/** Build picasso instance using [Picasso.Builder] DSL. */
inline fun Context.picasso(
    builder: Picasso.Builder.() -> Unit
): Picasso = Picasso.Builder(this).apply(builder).build()