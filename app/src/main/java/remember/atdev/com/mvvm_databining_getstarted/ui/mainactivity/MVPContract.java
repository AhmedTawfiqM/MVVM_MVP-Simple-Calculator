package remember.atdev.com.mvvm_databining_getstarted.ui.mainactivity;

public interface MVPContract {

    interface mvpView {

        void setDivideValue(int n1, int n2);
    }

    interface mvpPresenter {

        void onDivide(int n1, int n2);
    }
}
