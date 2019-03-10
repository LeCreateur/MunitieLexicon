package nl.munitielexicon.munitielexicon;

import android.support.v7.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;

import java.io.IOException;

public class LoadDatabaseAsync extends AsyncTask<Void, Void, Boolean> {
    private Context context;
    private AlertDialog alertDialog;
    private DatabaseHelper myDBHelper;

    public LoadDatabaseAsync(Context context){
        this.context = context;
    }

    @Override
    protected void onPreExecute(){
        //TODO Auto-generated method stub
        super.onPreExecute();

        AlertDialog.Builder d = new AlertDialog.Builder(context, R.style.MyDialogTheme);
        LayoutInflater inflater = LayoutInflater.from(context);
        View dialogView = inflater.inflate(R.layout.alert_dialog_database_copying, null);
        d.setTitle("Loading Database...");
        d.setView(dialogView);
        alertDialog = d.create();

        alertDialog.setCancelable(false);
        alertDialog.show();
    }

    @Override
    protected Boolean doInBackground(Void...params){

        myDBHelper = new DatabaseHelper(context);

        try {
            myDBHelper.createDataBase();
        } catch (IOException e){

            throw new Error("Database was not created");
        }
        myDBHelper.close();
        return null;
    }

    protected void onProgressUpdate(Void...values){
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Boolean result){
        super.onPostExecute(result);
        alertDialog.dismiss();
        MainActivity.openDatabase();
    }

}
