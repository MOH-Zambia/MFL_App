package com.moh.mfl.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mfl.mfl.R;
import com.moh.mfl.model.Facility;
import com.moh.mfl.ui.search.SearchFragment;

import java.util.List;

public class FacilityAdapter extends ArrayAdapter<Facility> {

    List<Facility> customerTransactions;
    Context context;
    private LayoutInflater mInflater;
    static final int ROW = 0;
    static final int HEADER = 1;

    // Constructors
    public FacilityAdapter(Context context, List<Facility> objects) {
        super(context, 0, objects);
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        customerTransactions = objects;
    }

    @Override
    public Facility getItem(int position) {
        return customerTransactions.get(position);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public int getItemViewType(int position) {

        //CHECK IF CURRENT ITEM IS PLAYER THEN RETURN ROW
        if (getItem(position) instanceof Facility) {
            return ROW;
        }

        //OTHERWISE RETURN HEADER
        return HEADER;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder vh;
        if (convertView == null) {
            View view = mInflater.inflate(R.layout.faciltiest_listview, parent, false);
            vh = ViewHolder.create((RelativeLayout) view);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        Facility item = getItem(position);

        vh.name.setText("Facility name: " + item.getName());
        vh.province.setText("Province " + item.getProvince());
        vh.district.setText("District: " + item.getDistrict());
        vh.constituency.setText("Constituency : " + item.getConstituency());
        vh.ownership.setText("Ownership : " + item.getOwnersip());
        vh.operation_status.setText("Operation status : " + item.getOperationStatus());
        vh.facility_type.setText("Facility type : " + item.getFacilityType());
        vh.number_of_beds.setText("Number of beds : " + item.getNumberOfBeds());
        vh.number_of_nurses.setText("Number of nurses : " + item.getNumberOfNurses());
        vh.number_of_doctors.setText("Number of doctors : " + item.getNumberOfDoctors());
        vh.address_line1.setText("Address : " + item.getAddressLine());
        vh.phone.setText("Phone : " + item.getPhone());

        return vh.rootView;
    }

    private static class ViewHolder {
        public final RelativeLayout rootView;
        public final TextView name;
        public final TextView district;
        public final TextView constituency;
        public final TextView province;
        public final TextView ownership;
        public final TextView operation_status;
        public final TextView facility_type;
        public final TextView number_of_beds;
        public final TextView number_of_nurses;
        public final TextView number_of_doctors;
        public final TextView address_line1;
        public final TextView phone;

        private ViewHolder(RelativeLayout rootView, TextView name, TextView constituency, TextView district,
                           TextView province, TextView ownership, TextView operation_status, TextView facility_type,
                           TextView number_of_beds, TextView number_of_nurses, TextView number_of_doctors,
                           TextView address_line1, TextView phone) {
            this.rootView = rootView;
            this.name = name;
            this.constituency = constituency;
            this.district = district;
            this.province = province;
            this.ownership = ownership;
            this.operation_status = operation_status;
            this.facility_type = facility_type;
            this.number_of_beds = number_of_beds;
            this.number_of_nurses = number_of_nurses;
            this.number_of_doctors = number_of_doctors;
            this.address_line1 = address_line1;
            this.phone = phone;
        }

        public static ViewHolder create(RelativeLayout rootView) {
            TextView name = (TextView) rootView.findViewById(R.id.name);
            TextView constituency = (TextView) rootView.findViewById(R.id.constituency);
            TextView district = (TextView) rootView.findViewById(R.id.district);
            TextView province = (TextView) rootView.findViewById(R.id.province);
            TextView ownership = (TextView) rootView.findViewById(R.id.ownership);
            TextView operation_status = (TextView) rootView.findViewById(R.id.operation_status);
            TextView number_of_beds = (TextView) rootView.findViewById(R.id.number_of_beds);
            TextView number_of_nurses = (TextView) rootView.findViewById(R.id.number_of_nurses);
            TextView number_of_doctors = (TextView) rootView.findViewById(R.id.number_of_doctors);
            TextView address_line1 = (TextView) rootView.findViewById(R.id.address_line1);
            TextView phone = (TextView) rootView.findViewById(R.id.phone);
            TextView facility_type = (TextView) rootView.findViewById(R.id.facility_type);
            return new ViewHolder(rootView, name, constituency, district, province,
                     ownership,  operation_status, facility_type,
                     number_of_beds,  number_of_nurses,  number_of_doctors,
                     address_line1,  phone);
        }
    }
}
