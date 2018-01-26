package bs.joker.weatheragregator.ui.holder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import bs.joker.MyApplication;
import bs.joker.weatheragregator.R;
import bs.joker.weatheragregator.model.view.ForecastDaily5ItemViewModel;
import butterknife.Unbinder;

/**
 * Created by bakays on 15.01.2018.
 */

public class ForecastDaily5ViewHolder extends BaseViewHolder<ForecastDaily5ItemViewModel> {

    TextView date_tv, temp_max, temp_min, description_day, description_night;
    ImageView icon_day, icon_night;
    Integer icon;

    private Unbinder mUnbinder;
    private Context mContext;

    public ForecastDaily5ViewHolder(View itemView) {
        super(itemView);

        date_tv = (TextView) itemView.findViewById(R.id.date_tv);
        temp_max = (TextView) itemView.findViewById(R.id.temp_max);
        temp_min = (TextView) itemView.findViewById(R.id.temp_min);
        description_day = (TextView) itemView.findViewById(R.id.description_weather_day_text_view);
        description_night = (TextView) itemView.findViewById(R.id.description_weather_night_text_view);
        icon_day = (ImageView) itemView.findViewById(R.id.icon_day);
        icon_night = (ImageView) itemView.findViewById(R.id.icon_night);


        MyApplication.getApplicationComponent().inject(this);

        mContext = itemView.getContext();
    }

    @Override
    public void bindViewHolder(ForecastDaily5ItemViewModel items) {
        date_tv.setText(items.getDate_tv());
        temp_max.setText(items.getTemp_max());
        temp_min.setText(items.getTemp_min());
        description_day.setText(items.getDescription_day());
        description_night.setText(items.getDescription_night());
        icon_day.setImageResource(getIcon(items.getIcon_day(), true));
        icon_night.setImageResource(getIcon(items.getIcon_night(), false));
    }

    public int getIcon(int code, boolean isDay){
        switch (code) {
            case 1:
                if(isDay) {
                    icon = R.drawable.clear_sky_d_black;
                }else {
                icon = R.drawable.clear_sky_n_black;}
                break;
            case 2:
            case 7:
            case 8:
                if(isDay) {
                    icon = R.drawable.mostly_sunny_d_black;
                }else {
                icon = R.drawable.mostly_sunny_n_black;}
                break;
            case 3:
                if(isDay) {
                    icon = R.drawable.mostly_cloudy_d_black;
                }else {
                icon = R.drawable.mostly_cloudy_n_black;}
                break;
            case 4:
                if(isDay) {
                    icon = R.drawable.cloudy_d_black;
                }else {
                icon = R.drawable.cloudy_d_black;}
                break;
            case 5:
            case 6:
                if(isDay) {
                    icon = R.drawable.fog_black;
                }else {
                icon = R.drawable.fog_black;}
                break;
            case 9:
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
                if(isDay) {
                    icon = R.drawable.snow_black;
                }else {
                icon = R.drawable.snow_black;}
                break;
            case 10:
            case 11:
                if(isDay) {
                    icon = R.drawable.shower_black;
                }else {
                icon = R.drawable.shower_black;}
                break;
            case 12:
            case 13:
                if(isDay) {
                    icon = R.drawable.rain_black;
                }else {
                icon = R.drawable.rain_black;}
                break;
            case 14:
            case 15:
                if(isDay) {
                    icon = R.drawable.thunderstorm_black;
                }else {
                icon = R.drawable.thunderstorm_black;}
                break;
            case 16:
                if(isDay) {
                    icon = R.drawable.ice_pellets_black;
                }else {
                icon = R.drawable.ice_pellets_black;}
                break;
            case 17:
                if(isDay) {
                    icon = R.drawable.na_black;
                }else {
                icon = R.drawable.na_black;}
                break;
            case 22:
            case 23:
                if(isDay) {
                    icon = R.drawable.ice_pellets_black;
                }else {
                icon = R.drawable.ice_pellets_black;}
                break;
            case 25:
                if(isDay) {
                    icon = R.drawable.snow_rain_black;
                }else {
                icon = R.drawable.snow_rain_black;}
                break;
            case 26:
                if(isDay) {
                    icon = R.drawable.windy_black;
                }else {
                icon = R.drawable.windy_black;}
                break;
            case 27:
                if(isDay) {
                    icon = R.drawable.low_temp_black;
                }else {
                icon = R.drawable.low_temp_black;}
                break;
            case 28:
                if(isDay) {
                    icon = R.drawable.high_temp_black;
                }else {
                icon = R.drawable.high_temp_black;}
                break;
            default:
                if(isDay) {
                    icon = R.drawable.na_black;
                }else {
                icon = R.drawable.na_black;}
                break;
        }
        return icon;
    }

//    public int getIcon(int code, boolean isDay){
//        switch (code) {
//            case 1:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.clear_sky_d_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.clear_sky_n_black);}
//                break;
//            case 2:
//            case 7:
//            case 8:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.mostly_sunny_d_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.mostly_sunny_n_black);}
//                break;
//            case 3:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.mostly_cloudy_d_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.mostly_cloudy_n_black);}
//                break;
//            case 4:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.cloudy_d_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.cloudy_d_black);}
//                break;
//            case 5:
//            case 6:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.fog_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.fog_black);}
//                break;
//            case 9:
//            case 18:
//            case 19:
//            case 20:
//            case 21:
//            case 24:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.snow_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.snow_black);}
//                break;
//            case 10:
//            case 11:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.shower_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.shower_black);}
//                break;
//            case 12:
//            case 13:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.rain_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.rain_black);}
//                break;
//            case 14:
//            case 15:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.thunderstorm_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.thunderstorm_black);}
//                break;
//            case 16:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.ice_pellets_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.ice_pellets_black);}
//                break;
//            case 17:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.na_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.na_black);}
//                break;
//            case 22:
//            case 23:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.ice_pellets_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.ice_pellets_black);}
//                break;
//            case 25:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.snow_rain_black);
//                }else {
//                    icon_day.setImageResource(R.drawable.snow_rain_black);}
//                break;
//            case 26:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.windy_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.windy_black);}
//                break;
//            case 27:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.low_temp_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.low_temp_black);}
//                break;
//            case 28:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.high_temp_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.high_temp_black);}
//                break;
//            default:
//                if(isDay) {
//                    icon_day.setImageResource(R.drawable.na_black);
//                }else {
//                    icon_night.setImageResource(R.drawable.na_black);}
//                break;
//        }
//        return icon;
//    }

    @Override
    public void unBindViewHolder() {
        date_tv.setText(null);
        description_day.setText(null);
        description_night.setText(null);
        temp_max.setText(null);
        temp_min.setText(null);
        icon_day = null;
        icon_night = null;
    }
}