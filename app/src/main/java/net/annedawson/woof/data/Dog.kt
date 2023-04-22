/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.annedawson.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import net.annedawson.woof.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.gin, R.string.dog_name_1, 8, R.string.dog_description_1),
    Dog(R.drawable.tonic, R.string.dog_name_2, 4, R.string.dog_description_2),
    Dog(R.drawable.basil, R.string.dog_name_3, 5, R.string.dog_description_3),
    Dog(R.drawable.bella, R.string.dog_name_4, 4, R.string.dog_description_4),
    Dog(R.drawable.dave, R.string.dog_name_5, 8, R.string.dog_description_5),
    Dog(R.drawable.sally, R.string.dog_name_6, 14, R.string.dog_description_6),
    Dog(R.drawable.mona, R.string.dog_name_7, 2, R.string.dog_description_7),
    Dog(R.drawable.rover, R.string.dog_name_8, 7, R.string.dog_description_8),
    Dog(R.drawable.lola, R.string.dog_name_9, 4, R.string.dog_description_9)
)