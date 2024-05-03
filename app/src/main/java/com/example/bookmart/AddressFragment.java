package com.example.bookmart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.textfield.TextInputEditText;

public class AddressFragment extends Fragment {

    private TextInputEditText fullnameEditText, phoneEditText, addressEditText, streetEditText,
            landmarkEditText, pincodeEditText, cityEditText, stateEditText;
    private Button submitButton;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_address, container, false);

        // Initialize UI components
        fullnameEditText = view.findViewById(R.id.fullname);
        phoneEditText = view.findViewById(R.id.phonno);
        addressEditText = view.findViewById(R.id.address);
        streetEditText = view.findViewById(R.id.street);
        landmarkEditText = view.findViewById(R.id.landmark);
        pincodeEditText = view.findViewById(R.id.pincode);
        cityEditText = view.findViewById(R.id.city);
        stateEditText = view.findViewById(R.id.state);
        submitButton = view.findViewById(R.id.submitButton);

        // Set onFocusChangeListeners to clear errors when gaining focus
        setFocusChangeListener(fullnameEditText);
        setFocusChangeListener(phoneEditText);
        setFocusChangeListener(addressEditText);
        setFocusChangeListener(streetEditText);
        setFocusChangeListener(landmarkEditText);
        setFocusChangeListener(pincodeEditText);
        setFocusChangeListener(cityEditText);
        setFocusChangeListener(stateEditText);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateInputs()) {
                    // All EditText fields are properly filled

                    // this code for passing the value to anther fragment
                    Bundle bundle = new Bundle();
                    bundle.putString("Name",fullnameEditText.getText().toString());
                    bundle.putString("Address",addressEditText.getText().toString());

                    getParentFragmentManager().setFragmentResult("datafrom1",bundle);

                    Bundle bundle2 = new Bundle();
                    bundle2.putString("flatHouse",addressEditText.getText().toString());
                    bundle2.putString("area", streetEditText.getText().toString());
                    bundle2.putString("phone",phoneEditText.getText().toString());
                    bundle2.putString("landmark", landmarkEditText.getText().toString());
                    bundle2.putString("town",cityEditText.getText().toString());
                    bundle2.putString("pincode", pincodeEditText.getText().toString());
                    bundle2.putString("state", stateEditText.getText().toString());
                    getParentFragmentManager().setFragmentResult("datafrom3",bundle2);

                    navigateToPaymentFragment();
                }
            }
        });

        return view;
    }

    // Validate the input fields
    // Validate the input fields
    private boolean validateInputs() {
        boolean isValid = true;

        if (fullnameEditText.getText().toString().isEmpty()) {
            fullnameEditText.setError("Enter your fullname");
            isValid = false;
        }

        if (phoneEditText.getText().toString().isEmpty()) {
            phoneEditText.setError("Enter phone no");
            isValid = false;
        }

        if (addressEditText.getText().toString().isEmpty()) {
            addressEditText.setError("Enter address");
            isValid = false;
        }

        if (streetEditText.getText().toString().isEmpty()) {
            streetEditText.setError("Enter street");
            isValid = false;
        }

        if (landmarkEditText.getText().toString().isEmpty()) {
            landmarkEditText.setError("Enter landmark");
            isValid = false;
        }

        if (pincodeEditText.getText().toString().isEmpty()) {
            pincodeEditText.setError("Enter pincode");
            isValid = false;
        }

        if (cityEditText.getText().toString().isEmpty()) {
            cityEditText.setError("Enter city");
            isValid = false;
        }

        if (stateEditText.getText().toString().isEmpty()) {
            stateEditText.setError("Enter state");
            isValid = false;
        }

        return isValid;
    }


    private void navigateToPaymentFragment() {
        // Replace 'YourFragmentContainer' with the ID of the container (e.g., FrameLayout) in your activity's layout
        // Create the instance of the fragment where you want to pass the data
        PaymentFragment paymentFragment = new PaymentFragment();


        // Use FragmentTransaction to replace the current fragment with the new one
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, paymentFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    // Existing code...

    // Set onFocusChangeListener for clearing errors when gaining focus
    private void setFocusChangeListener(final EditText editText) {
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    // Clear the error message when the EditText gains focus
                    editText.setError(null);
                }
            }
        });
    }
}
