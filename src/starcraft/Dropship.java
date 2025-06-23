package starcraft;
// 수송기
// 8개의 지상유닛을 태울수 있따.
public class Dropship extends FlyingUnit {
    protected GroundUnit[] units = new GroundUnit[8];
    protected int loadedIndex = 0;

    // 유닛 하나를 태운다. 매소드명 load
    // 태웠으면 return true, 못 태웠으면 return false

    public boolean load(GroundUnit unit) {
        if(units.length == loadedIndex) {
            return false;
        }
        units[loadedIndex++] = unit;
        return true;
    }

    // 유닛하나를 떨군다. 메소드명 unload
    // 떨굴 유닛이 없으면 return null;
    public GroundUnit unload() {
        if(loadedIndex == 0) {
            return null;
        }
        GroundUnit groundUnit = units[loadedIndex--];
        units[loadedIndex] = null;
        return groundUnit;
    }

}





//// 지상 유닛인지 확인때리기
//        if (unit instanceof GroundUnit) {
//        return true;
//        }
//        // 1명이라도 있으면 태우는 거니께 아마도 for문?
//         for (int i=0; i< units.length; i++) {
//             if (null == units[i]) { // 타입이 객체라서 0이 아니라 null
//                 units[i] = unit;
//                 return true;
//             }
//         }
//        return false;
