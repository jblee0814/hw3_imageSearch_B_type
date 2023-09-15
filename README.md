# hw3_imageSearch_B_type


**Model** 

Retrofit을 사용하여 네트워크 통신을 구현했습니다. (retrofit_client, Retrofit_interface)
데이터 저장을 위한 모델(SearchItemModel)이 있습니다.


**View** 

SearchFragment가 메인 UI를 담당하는 부분입니다.
UI에 바인딩 된 객체(FragmentSearchBinding)를 통해 UI 업데이트를 합니다.


**ViewModel** 

SearchViewModel은 View와 Model 사이의 다리 역할을 합니다.
LiveData를 사용하여 UI의 상태 및 데이터 변경을 관찰합니다.
비즈니스 로직이 구현되어 있습니다.

