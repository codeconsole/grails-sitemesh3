package org.sitemesh.grails.plugins.sitemesh3

class UrlMappings {
    static mappings = {
        "/layouts/$name"(controller: 'layout', action: 'get')

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
