package lol.fmg.hub.controllers.usersControllers;

import lol.fmg.hub.models.users.Permission;
import lol.fmg.hub.repositories.usersRepositories.PermissionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permissions")
public class PermissionController {
    private final PermissionRepository permissionRepository;

    public PermissionController(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    // CRUD
    // Create
    @PostMapping
    public ResponseEntity<Permission> createPermission(@RequestBody Permission permission) {
        Permission savedPermission = permissionRepository.save(permission);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPermission);
    }

    // ReadAll
    @GetMapping
    public ResponseEntity<List<Permission>> getPermissions() {
        List<Permission> permissions = permissionRepository.findAll();
        if (permissions.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(permissions);
    }

    // ReadOneByID
    @GetMapping("/{permissionId}")
    public ResponseEntity<Permission> getPermission(@PathVariable Long permissionId) {
        Permission permission = permissionRepository.findById(permissionId).orElse(null);
        if (permission == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(permission);
    }

    // Update
    @PutMapping("/{permissionId}")
    public ResponseEntity<Permission> updatePermission(@PathVariable Long permissionId, @RequestBody Permission updatedPermission) {
        Permission permission = permissionRepository.findById(permissionId).orElse(null);
        if (permission == null) {
            return ResponseEntity.notFound().build();
        }
        permission.setWrite(updatedPermission.isWrite());
        permission.setRead(updatedPermission.isRead());
        permission.setCreate(updatedPermission.isCreate());
        permission.setUpdate(updatedPermission.isUpdate());
        permission.setDelete(updatedPermission.isDelete());

        Permission savedPermission = permissionRepository.save(updatedPermission);
        return ResponseEntity.ok(savedPermission);
    }

    // Delete
    @DeleteMapping("/{permissionId}")
    public ResponseEntity<Void> deletePermission(@PathVariable Long permissionId) {
        Permission permission = permissionRepository.findById(permissionId).orElse(null);
        if (permission == null) {
            return ResponseEntity.notFound().build();
        }
        permissionRepository.delete(permission);
        return ResponseEntity.noContent().build();
    }
}