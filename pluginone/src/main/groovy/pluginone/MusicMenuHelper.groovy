package pluginone

import pablopazosmenus.MenuHelper
import pablopazosmenus.MenuInfo

class MusicMenuHelper implements MenuHelper {

    String label = 'Music'

    @Override
    MenuInfo[] getMenuInfos() {
        [new MenuInfo(label: 'Rush', controller: 'music', action: 'rush'),
         new MenuInfo(label: 'Pink Floyd', controller: 'music', action: 'floyd')]
    }
}
