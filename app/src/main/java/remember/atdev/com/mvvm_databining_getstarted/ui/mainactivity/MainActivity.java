package remember.atdev.com.mvvm_databining_getstarted.ui.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.app.Presentation;
import android.os.Bundle;
import android.view.View;

import remember.atdev.com.mvvm_databining_getstarted.R;
import remember.atdev.com.mvvm_databining_getstarted.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MVPContract.mvpView {

    MainViewModel mainViewModel;
    ActivityMainBinding binding;

    // MVP with Divide
    MVPContract.mvpPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        binding.setViewmodel(mainViewModel);
        binding.setLifecycleOwner(this);

        binding.setNum1(4);
        binding.setNum2(12);

        // MVP
        presenter = new mainPresenter(this);
        binding.btnDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                presenter.onDivide(12, 3);
            }
        });

    }

    @Override
    public void setDivideValue(int n1, int n2) {

        binding.txvDevide.setText(String.valueOf(n1/n2));
    }
}
