package remember.atdev.com.mvvm_databining_getstarted.ui.mainactivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import remember.atdev.com.mvvm_databining_getstarted.utils.StringConvertor;

public class MainViewModel extends AndroidViewModel {

    public MutableLiveData<String> movieNameLiveDat = new MutableLiveData<>();
    public MutableLiveData<String> plusNum = new MutableLiveData<>();
    public MutableLiveData<String> MultipleNum = new MutableLiveData<>();

    public MainViewModel(@NonNull Application application) {
        super(application);
    }


    public void setMovieNameLiveDat() {

        movieNameLiveDat.setValue("Cast away");
    }


    public int Plus(int n1, int n2) {
        return n1 + n2;
    }

    public void setPlus(int n1, int n2) {
        plusNum.setValue(String.valueOf(Plus(n1, n2)));
    }

    public void setMultiple(int n1,int n2){
        MultipleNum.setValue(StringConvertor.convertINT(n1*n2));
    }
}
