package mvc

class UrlMappings {

    static mappings = {
        "/people"(resources: "person")
        "/rooms"(resources: "room")
        "/bookings"(resources: "booking")

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
