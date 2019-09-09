package bs.joker.weatheragregator.mvp.view;

import com.arellomobile.mvp.MvpView;

import java.util.List;

import bs.joker.weatheragregator.model.view.BaseViewModel;

/**
 * Created by 1 on 07.05.2018.
 */

public interface DailyForecastView extends MainView {
    void setItemsD5WBIO(List<BaseViewModel> items);
    void setItemsD5AW(List<BaseViewModel> items);
    void setItemsD5DS(List<BaseViewModel> items);
    void showListProgressD5(int n);
    void hideListProgressD5(int n);
}
