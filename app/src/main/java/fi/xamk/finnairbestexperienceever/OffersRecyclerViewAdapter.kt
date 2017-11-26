package fi.xamk.finnairbestexperienceever

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import fi.xamk.finnairbestexperienceever.dummy.DummyContent.DummyItem

class OffersRecyclerViewAdapter(private val mValues: List<DummyItem>) : RecyclerView.Adapter<OffersRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_list_offer, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.mItem = mValues[position]
        holder.mTextView.text = mValues[position].id
        holder.mDetailView.text = mValues[position].details
        Glide.with(holder.mView.context).load(mValues[position].img).into(holder.mImageView)
    }

    override fun getItemCount(): Int {
        return mValues.size
    }

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mTextView: TextView
        val mImageView: ImageView
        val mDetailView: TextView
        var mItem: DummyItem? = null

        init {
            mTextView = mView.findViewById<TextView>(R.id.text)
            mImageView = mView.findViewById<ImageView>(R.id.image)
            mDetailView = mView.findViewById<TextView>(R.id.details);
        }



    }
}
