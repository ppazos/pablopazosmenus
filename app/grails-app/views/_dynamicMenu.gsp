<g:each var="helper" in="${menuHelpers}">
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
           aria-expanded="false">${helper.label} <span class="caret"></span></a>
        <ul class="dropdown-menu">
            <g:each var="menuInfo" in="${helper.menuInfos}">
                <li class="dropdown-item"><g:link action="${menuInfo.action}"
                                                  controller="${menuInfo.controller}">${menuInfo.label}</g:link></li>
            </g:each>
        </ul>
    </li>
</g:each>


