package app.schotersfinalproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View ): RecyclerView.ViewHolder(itemView){
    private val textViewID: TextView = itemView.findViewById(R.id.textViewID)
    private val textViewAuthor: TextView = itemView.findViewById(R.id.textViewID)
    private val textViewLength: TextView = itemView.findViewById(R.id.textViewLength)
    private val textViewContent: TextView = itemView.findViewById(R.id.textViewContent)
    private val textViewDateAdded: TextView = itemView.findViewById(R.id.textViewDateAdded)
    private val textViewDateModified: TextView = itemView.findViewById(R.id.textViewDateModified)
    private val textViewAuthorSlug: TextView = itemView.findViewById(R.id.textviewAuthorSlug)

    fun bindView(postModel: PostModel){
        textViewID.text = postModel._id
        textViewAuthor.text = postModel.author
        textViewContent.text = postModel.content
        textViewLength.text = postModel.length.toString()
        textViewDateAdded.text = postModel.dateAdded
        textViewDateModified.text = postModel.dateModified


    }

}