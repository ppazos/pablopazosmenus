package pablopazosmenus

import org.springframework.beans.factory.annotation.Autowired

class MenuTagLib {

    static namespace = 'pablo'

    @Autowired
    List<MenuHelper> menuHelpers

    def renderMenu = { attrs ->
        out << render(template: '/dynamicMenu', model: [menuHelpers: menuHelpers])
    }
}
