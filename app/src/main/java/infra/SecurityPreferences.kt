package infra

import android.content.Context

class SecurityPreferences(val context: Context) {
    private val mSharedPreferences =
        context.getSharedPreferences("motivation", Context.MODE_PRIVATE)

    fun storeString(key: String, value: String){
        this.mSharedPreferences.edit().putString(key, value).apply()
    }
    fun getString (key: String): String {
        return this.mSharedPreferences.getString(key,"") ?: ""
    }
}