package com.jblee.imagesearch.viewmodel.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * SharedViewModel 클래스는 앱의 여러 프래그먼트나 액티비티 간에 공유된 데이터를 저장하고 관리하는 데 사용됩니다.
 * 예를 들어, 사용자가 이미지를 삭제하면 해당 이미지의 URL이 이 ViewModel에 저장되고, 관련된 모든 뷰가 이 변경을 감지하고 반응할 수 있습니다.
 */
class SharedViewModel : ViewModel() {

    // MutableLiveData는 변경 가능한 LiveData입니다.
    // 이는 내부적으로 데이터를 변경할 수 있지만, 외부에서는 읽기 전용인 LiveData로 접근됩니다.
    private val _deletedItemUrl = MutableLiveData<String>()

    // deletedItemUrl은 _deletedItemUrl의 불변 버전입니다.
    // 이를 통해 다른 클래스에서는 데이터를 읽을 수는 있지만 수정할 수는 없습니다.
    val deletedItemUrl: LiveData<String> get() = _deletedItemUrl

    /**
     * deleteItem 함수는 사용자가 이미지를 삭제할 때 호출됩니다.
     * @param url 삭제된 이미지의 URL
     */
    fun deleteItem(url: String) {
        // 삭제된 아이템의 URL을 _deletedItemUrl에 설정합니다.
        // 관찰자(예: 프래그먼트나 액티비티)는 이 변경을 감지하고 적절한 조치를 취할 수 있습니다.
        _deletedItemUrl.value = url
    }
}
