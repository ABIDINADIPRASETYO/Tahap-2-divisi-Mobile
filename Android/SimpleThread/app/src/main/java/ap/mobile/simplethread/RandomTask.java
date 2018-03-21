package ap.mobile.simplethread;

import android.os.AsyncTask;
import android.widget.TextView;

/**
 * Created by aryo on 6/11/17.
 */

public class RandomTask extends AsyncTask<Void, Integer, Void> {


    private TextView tvHello;

    public RandomTask(TextView tvHello) {
        this.tvHello = tvHello;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            while (true) {
                int angka = (int) (Math.random() * 10);
                publishProgress(angka);
                Thread.sleep(100);
            }
        } catch(Exception ex) {}
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        int angka = values[0];
        this.tvHello.setText(angka+"");
    }
}
