package ap.mobile.simplethread;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btStartStop;
    private TextView tvHello;
    private int angka;
    private Handler handler = new Handler();

    private Runnable uiRunnable = new Runnable() {
        @Override
        public void run() {
            tvHello.setText(angka + "");
        }
    };

    private Runnable bgRunnable = new Runnable() {
        @Override
        public void run() {

            try {

                // simulasi sebuah proses yang membutuhkan waktu 10s
                //Thread.sleep(10*1000);

                while(true) {
                    angka = (int)(Math.random()*10);
                    Thread.sleep(100);
                    handler.post(uiRunnable);
                }



            } catch(Exception e) {}

        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btStartStop =
                (Button) this.findViewById(R.id.btStartStop);
        this.tvHello =
                (TextView) this.findViewById(R.id.tvHello);
        this.btStartStop.setOnClickListener(this);

    }

    Thread t;
    RandomTask randomTask;

    @Override
    public void onClick(View view) {

        // jika AsyncTask belum dibuat
        // atau AsyncTask-nya sudah mati
        if(randomTask == null ||
                randomTask.getStatus() == AsyncTask.Status.FINISHED)
        {
            // buat AsyncTask
            randomTask = new RandomTask(this.tvHello);
            // jalankan AsyncTask
            randomTask.execute();
        } else {
            // hentikan AsyncTask
            randomTask.cancel(true);
        }


        /*
        // jika Thread belum dibuat
        // atau Thread-nya sudah mati (selesai)
        if(t == null || !t.isAlive()) {
            // maka buat Thread baru
            t = new Thread(this.bgRunnable);
            // jalankan
            t.start();
        } else if(t.isAlive()) { // jika thread hidup
            // hentikan (interupsi)
            t.interrupt();
        }
        */

    }
}
