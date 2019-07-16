package com.example.a2019hack.Page.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.a2019hack.R;
import com.example.a2019hack.adapter.ChildFindListviewAdapter;
import com.example.a2019hack.data.Child;
import com.example.a2019hack.data.ChildProtect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ChildListviewActivity.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ChildListviewActivity#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChildListviewActivity extends Fragment {

    private ListView childListView;
    private ChildFindListviewAdapter childFindListviewAdapter;

    private ArrayList<Child> childList;

    //----------------------------------------------------------

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ChildListviewActivity() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ChildListviewActivity.
     */
    // TODO: Rename and change types and number of parameters
    public static ChildListviewActivity newInstance(String param1, String param2) {
        ChildListviewActivity fragment = new ChildListviewActivity();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_child_find_listview, container, false);
    }

    //-----------------------------------------------------------------

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        childList = new ArrayList<>();

        childListView = getView().findViewById(R.id.childListview);

        childList.add(new Child(
                R.drawable.child_image, "제정민", "남", "대구소프트웨어고 정문", "18", "185cm", "80kg"));

        childList.add(new Child(
                R.drawable.child_image, "제정민", "남", "대구소프트웨어고 정문", "18", "185cm", "80kg"));

        childList.add(new Child(
                R.drawable.child_image, "제정민", "남", "대구소프트웨어고 정문", "18", "185cm", "80kg"));

        childList.add(new Child(
                R.drawable.child_image, "제정민", "남", "대구소프트웨어고 정문", "18", "185cm", "80kg"));

        childList.add(new Child(
                R.drawable.child_image, "제정민", "남", "대구소프트웨어고 정문", "18", "185cm", "80kg"));


        Collections.reverse(childList);

        childFindListviewAdapter = new ChildFindListviewAdapter(Objects.requireNonNull(getContext()).getApplicationContext(), childList);

        childListView.setAdapter(childFindListviewAdapter);

        childListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }
        });
    }

    //-----------------------------------------------------------------

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
