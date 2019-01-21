package com.amrhal.lumoncoursestests

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.amrhal.discovermovieskt.data.remote.CoursesApi
import com.amrhal.discovermovieskt.data.remote.RetrofitClientInstance
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import kotlinx.android.synthetic.main.activity_sign_up_google1.*
import android.content.Intent
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.tasks.Task
import com.google.android.gms.common.api.ApiException


class SignUpGoogle : AppCompatActivity() {
    val retrofit = RetrofitClientInstance.getInstance()?.create(CoursesApi::class.java)
    val RC_SIGN_IN = 1

    val ClientId = "936524052656-j20lqh9ejp0qkj3qe5f0efqfuvitgf7g.apps.googleusercontent.com"
    val ClientId2 = "936524052656-ioedciiamdqh7hgokddokr520qa2e0ro.apps.googleusercontent.com"
    val ClientId3 = "936524052656-npdqt1qndtih94c07v25f5mr9k2h8aj6.apps.googleusercontent.com"

    val ClientIdamr = "450329376278-k2avo02fc55qokqlktcg53p95prbatg0.apps.googleusercontent.com"

    var mGoogleSignInClient: GoogleSignInClient? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_google1)

        googleSignIn()
        sign_in_button.setOnClickListener { signIn() }


    }

    private fun signIn() {
        val signInIntent = mGoogleSignInClient?.getSignInIntent()
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }

    private fun googleSignIn() {

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(ClientId3)
            .requestEmail()
            .build()

        // Build a GoogleSignInClient with the options specified by gso.

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso)
        // Check for existing Google Sign In account, if the user is already signed in
        // the GoogleSignInAccount will be non-null.
        val account = GoogleSignIn.getLastSignedInAccount(this)
        if (account == null) {

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode === RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
        }
    }

    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>?) {
        try {
            val account = completedTask?.getResult(ApiException::class.java)
            val idToken = account?.idToken
            Log.e("tag", "idUserToken= $idToken")
            // TODO(developer): send ID Token to server and validate

            // updateUI(account)
        } catch (e: ApiException) {
            Log.e("tag", "handleSignInResult:error", e)
            // updateUI(null)
        }


    }


    private fun retrofitCall() {
//        retrofit?.getAny()?.enqueue(object : Callback<ResponseBody> {
//            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
//                val MResponse: String? = response.body()?.string()
//
//            }
//
//            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
//                Log.e("tag", "onFailure throw : ${t.localizedMessage}")
//            }
//        })

    }

}


