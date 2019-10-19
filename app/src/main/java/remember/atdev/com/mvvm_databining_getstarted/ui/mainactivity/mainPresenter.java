package remember.atdev.com.mvvm_databining_getstarted.ui.mainactivity;

import androidx.lifecycle.MutableLiveData;

public class mainPresenter implements MVPContract.mvpPresenter {

    MVPContract.mvpView view;


    public mainPresenter(MVPContract.mvpView view) {
        this.view = view;
    }

    @Override
    public void onDivide(int n1, int n2) {

        if (n1 !=0 && n2!=0){

            view.setDivideValue(n1,n2);
        }
    }
}
