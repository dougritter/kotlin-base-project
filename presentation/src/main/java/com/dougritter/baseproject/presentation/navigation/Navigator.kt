package com.dougritter.baseproject.presentation.navigation

import android.content.Context

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Class used to navigate through the application.
 */
@Singleton
class Navigator
@Inject
constructor()//empty
{

    /**
     * example
     * Goes to the user list screen.
     * @param context A Context needed to open the destiny activity.
     */
    fun navigateToUserList(context: Context?) {
        if (context != null) {
            /*Intent intentToLaunch = UserListActivity.getCallingIntent(context);
      context.startActivity(intentToLaunch);*/
        }
    }

}
