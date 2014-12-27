package com.linuscys.sample.material_template;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SimpleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SimpleFragment extends Fragment {
    private static final String ARG_TITLE = "title";

    private String mTitle;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment SimpleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SimpleFragment newInstance(String title) {
        SimpleFragment fragment = new SimpleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    public SimpleFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mTitle = getArguments().getString(ARG_TITLE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple, container, false);
        TextView titleTextView = (TextView) view.findViewById(R.id.title);
        titleTextView.setText(mTitle);
        return view;
    }


}
