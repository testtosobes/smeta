<#import "parts/common.ftlh" as c>

<@c.page>
    <h5>Создать новую смету</h5>
    <div>Пошаговое создание нового документа</div>

    <div class="btn-group">
        <button type="button" class="btn btn-secondary dropdown-toggle" href="/test81" data-toggle="dropdown" aria-haspopup="true"
                aria-expanded="false">
            Right-aligned menu
        </button>
        <div class="dropdown-menu dropdown-menu-right">
            <#list all as task>
                <button class="dropdown-item" type="button">${task.NAME}</button>
                <button class="dropdown-item" type="button">Another action</button>
                <button class="dropdown-item" type="button">Something else here</button>
            </#list>
        </div>
    </div>
</@c.page>