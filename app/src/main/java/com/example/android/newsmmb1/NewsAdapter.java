package com.example.android.newsmmb1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

class NewsAdapter extends ArrayAdapter<NewsObject> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news    is the list of news, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<NewsObject> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_element, parent, false);
        }

        // Find the news at the given position in the list of news
        NewsObject currentNews = getItem(position);

        // Find the TextView with view ID title_view
        TextView titleView = listItemView.findViewById(R.id.title_view);
        // Display the title of the current news in that TextView
        titleView.setText(currentNews.getTitle());

        // Find the TextView with view ID category_view
        TextView sectionView = listItemView.findViewById(R.id.category_view);
        // Display the section name of the current news in that TextView
        sectionView.setText(currentNews.getNewsCategory());

        // Find the TextView with view ID author_view
        TextView authorView = listItemView.findViewById(R.id.author_view);
        // Display the author name of the current news in that TextView
        if (currentNews.getNewsAuthor() != "") {
            authorView.setText(currentNews.getNewsAuthor());

            //Set author name view as visible
            authorView.setVisibility(View.VISIBLE);
        } else {
            //Set author name view as gone
            authorView.setVisibility(View.GONE);
        }

        // Find the TextView with view ID date_view
        TextView dateView = null;
        if (currentNews.getNewsDate() != null) {
            dateView = listItemView.findViewById(R.id.date_view);
            // Format the date string
            String formattedDate = formatDate(currentNews.getNewsDate());
            // Display the date of the current news in that TextView
            dateView.setText(formattedDate);

            //Set date view visible
            dateView.setVisibility(View.VISIBLE);

        } else {
            //Set date view as gone
            dateView.setVisibility(View.GONE);
        }

        // Return the list item view that is now showing the required data
        return listItemView;
    }

    /**
     * Return the formatted date string from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }
}