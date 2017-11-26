package fi.xamk.finnairbestexperienceever


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class MainFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_main, container, false)

        val btnPersonalize = root.findViewById<View>(R.id.btn_personalized)
        val btnFindBest = root.findViewById<View>(R.id.btn_find_best)

        btnPersonalize.setOnClickListener { startPersonalizing() }
        btnFindBest.setOnClickListener { startFindBest() }

        return root
    }

    private fun startPersonalizing(): Unit {
        fragmentManager!!.beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.container, ExpandableExampleFragment(), MainActivity.FRAGMENT_LIST_VIEW)
                .addToBackStack(null)
                .commit()
    }

    private fun startFindBest(): Unit {
        fragmentManager!!.beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.container, OffersFragment(), MainActivity.FRAGMENT_LIST_VIEW)
                .addToBackStack(null)
                .commit()
    }

}
