package plugintwo

import pablopazosmenus.MenuHelper
import pablopazosmenus.MenuInfo

class BookMenuHelper implements MenuHelper {

    String label = 'Books'

    @Override
    MenuInfo[] getMenuInfos() {
        [new MenuInfo(label: "Hitchiker's Guide", controller: 'book', action: 'adams'),
         new MenuInfo(label: 'Infinite Jest', controller: 'book', action: 'wallace')]
    }
}
