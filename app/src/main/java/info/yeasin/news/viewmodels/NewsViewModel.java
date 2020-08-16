package info.yeasin.news.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import info.yeasin.news.model.NewsResponse;
import info.yeasin.news.networking.NewsRepository;


public class NewsViewModel extends ViewModel {

    private MutableLiveData<NewsResponse> mutableLiveData;
    private NewsRepository newsRepository;

    public void init(){
        if (mutableLiveData != null){
            return;
        }
        newsRepository = NewsRepository.getInstance();
        mutableLiveData = newsRepository.getNews("google-news", "e1dae568db75423ca635b67a0648126c");

    }

    public LiveData<NewsResponse> getNewsRepository() {
        return mutableLiveData;
    }

}
